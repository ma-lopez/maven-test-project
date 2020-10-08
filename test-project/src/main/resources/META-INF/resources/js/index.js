$(document).ready(function () {
    run();
});

function run() {
    $.when(callToDocuments(), callToItinerary())
        .done((msg, a, b)  => console.log("#### ", msg))
        .fail((msg, a, b) => console.log("ERRR #### ", msg));
}

function callToDocuments() {
    return $.ajax({
        type: "POST",
        dataType: false,
        contentType: false,
        processData: false,
        url: "./all-documents",
        async: true,
    }).then(function (msg, a, b, c) { console.log("Documents => ", msg); return msg; })
        .fail(error => console.log("Error Document"));
}

function callToItinerary() {
    return $.ajax({
        type: "POST",
        dataType: false,
        contentType: false,
        processData: false,
        url: "./all-itinerary",
        async: true,
    }).then(function (msg, a, b, c) { console.log("Itinerary => ", msg); return msg; })
        .fail(error => console.log("Error Itinerary"));
}
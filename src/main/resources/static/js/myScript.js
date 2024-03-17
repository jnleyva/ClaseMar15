$('document').ready(function(){
    getStudents();
});
function saludar() {
    console.log("Hola mundo");
}

function saveStudent() {
    //Traer datos
    let nameSt = document.getElementById("studentName").value;

    let lastNameSt = $("#studentLastName").val();

    let data = {
        name: nameSt,
        lastName: lastNameSt
    }
    let dataToSend = JSON.stringify(data);
    //Enviar los datos!
    console.log(data);
    console.log(dataToSend);

    $.ajax({
        url: "holamundo/add",
        type: "POST",
        dataType: "JSON",
        contentType: "application/json; charset=utf-8",
        data: dataToSend,

        success: function (result) {
            console.log(result);
            $("#studentLastName").val("");
            $("#studentName").val("");
            getStudents();
        },
        error: function (error) {
            console.log(error);
        }
    });
}

function getStudents() {
    $.ajax({
        url: "holamundo/students",
        type: "GET",
        dataType: "JSON",
        contentType: "application/json; charset=utf-8",

        success: function (result) {
            paintStudents(result);
            $("#studentLastName").val("");
            $("#studentName").val("");
        },
        error: function (error) {
            console.log(error);
        }
    });
}

function paintStudents(st) {
    let k = "";
    for (let i = 0; i < st.length; i++) {
        k += `
              <h4>${st[i].id} ${st[i].name} ${st[i].lastName} </h4><br>  
            `;
    }
     $("#studentList").html(k);
}
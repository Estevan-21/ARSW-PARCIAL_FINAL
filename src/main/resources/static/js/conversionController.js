

function celTofar(){
    console.log("bien");
    
    var res=document.getElementById('result');  
    var cel=document.getElementById('cel').value;
    var text="<h3> El valor " + cel + " grados centígrados en grados Farenheit es: ";
    axios.get('/conversion/celTofar/'+cel)
      .then(function (response) {
        console.log(response.data.cel);
        text+=response.data.cel+"</H3>";
        res.innerHTML=text;  
 console.log(text);
      })
      .catch(function (error) {
        console.log(error);
      });      
}

function farTocel(){
    console.log("bien2");
    
    var res=document.getElementById('result2');  
    var far=document.getElementById('far').value;
    var text="<h3> El valor " + far + " grados Farenheit en grados Centígrados es: ";
    axios.get('/conversion/farTocel/'+far)
      .then(function (response) {
        console.log(response.data.far);
        text+=response.data.far+"</H3>";
        res.innerHTML=text;  
        console.log(text);
      })
      .catch(function (error) {
        console.log(error);
      });      
}
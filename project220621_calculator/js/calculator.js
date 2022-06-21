function operator(a){
    let result = document.querySelector("#result-area>div");
    let num1 = parseInt(document.querySelector("#number1").value);
    let num2 = parseInt(document.querySelector("#number2").value);

    let cal;

    switch(a){
        case "+" : 
            cal = num1 + num2;
            break;
        case "-" : 
            cal = num1 - num2;
            break;    
        case "x" : 
            cal = num1 * num2;
            break;
        case "/" :
            cal = num1 / num2;
            break; 
        case "%" :
            cal = num1 % num2;
            break; 
        }

    result.innerHTML = cal;
}
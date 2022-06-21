function changeMode(){
    const btn = document.querySelector("#mode");
    const calculator = document.querySelector("#calculator");
    const result = document.querySelector("#result-area");
    const number1 = document.querySelector("#number1");
    const number2 = document.querySelector("#number2");
    const operatorBtn = document.getElementsByTagName("button");

    if(btn.innerHTML == "라이트모드"){
        btn.innerHTML = "다크모드";
        calculator.style.backgroundColor = "#434949";
        result.style.borderColor = "#565a5a";
        number1.style.borderColor = "#565a5a";
        number2.style.borderColor = "#565a5a";
        for(let i in operatorBtn){
            operatorBtn[i].style.backgroundColor = "#434949";
            operatorBtn[i].style.color = "#ffffff";
        }
        
    }else{
        btn.innerHTML = "라이트모드";
        calculator.style.backgroundColor = "#f7f7f7";
        result.style.borderColor = "#f7f7f7";
        number1.style.borderColor = "#f7f7f7";
        number2.style.borderColor = "#f7f7f7";
        for(let i in operatorBtn){
            operatorBtn[i].style.backgroundColor = "#ffffff";
            operatorBtn[i].style.color = "#303030";
        }
    }
}
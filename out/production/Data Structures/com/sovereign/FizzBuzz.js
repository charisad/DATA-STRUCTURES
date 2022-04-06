function FizzBuzz(num){
    if(num % 15 == 0) {
        return "Fizz Buzz"
    } 
    else if(num % 3 == 0) {
        return "Fizz"
    }
    else if(num % 5 == 0) {
        return "Buzz"
    }else{
        return num;
    }
}

console.log('====================================');
console.log(FizzBuzz(6));
console.log('====================================');
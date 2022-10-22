
let numbers = [2, 5, 12, 13, 15, 18, 22];
//ここに答えを実装してください。↓↓↓
function isEven() {
    let num = numbers.filter(x => x % 2 == 0);
    console.log(num + 'は偶数です');
}

isEven();



class Car {

    constructor(gasoline, number) {
        this.gasoline = gasoline;
        this.number = number;
    }

    getNumGas() {
        console.log(`ガソリンは${this.gasoline}です。ナンバーは${this.number}です。`);
    }
}

let test = new Car('レギュラー', 10);
test.getNumGas();

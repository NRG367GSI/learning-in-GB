func task_1() {
    let teaPrices = ["черный": 100, "зеленый": 80, "белый": 120, "фруктовый": 90]
    let queue = ["черный", "зеленый", "белый", "фруктовый", "зеленый", "фруктовый"]

    for (index, item) in queue.enumerated() {
        if let price = teaPrices[item] {
            print("Покупатель номер \(index + 1) заказал \(item) чай за \(price) рублей")
        }
    }
}

func task_2() {
    let array = [-4, 5, 10, nil, 4, nil, 25, 0, nil, 16, 75, -20, -7, 15, 0, nil]
    let newArray = array.compactMap { $0 }.filter { $0 != 0 && $0 != 4 }.sorted()
    print(newArray)
}

//task_1()
//task_2()

func task_3(_ number: Int) {
    var resultArray = [1]
    var currentNumber = 1
    
    for _ in 2...number {
        currentNumber *= 2
        resultArray.append(currentNumber)
    }
    
    print(resultArray)
}

let number = 10
task_3(number)






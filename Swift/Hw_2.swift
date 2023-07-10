import Foundation

func contribution(money: Double, annualPercentage: Double, depositTerm: Double) -> Double {
    return money * pow((1 + annualPercentage / 100), depositTerm / 12)
}

print(contribution(money: 1000, annualPercentage: 10, depositTerm: 24))

enum PizzaType: String {
    case margherita = "Маргарита"
    case pepperoni = "Пеперони"
    case veggie = "Вегетарианская"
}

func getName(pizza : PizzaType) -> String {
    pizza.rawValue
}

print(getName(pizza: .margherita))
print(getName(pizza: .pepperoni))
print(getName(pizza: .veggie))



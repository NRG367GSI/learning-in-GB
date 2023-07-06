func task_1() -> Void {
    for i in 0...100 where i % 2 == 0 {
 
    print(i) // 0, 2, 4, 6, 8, 10
    }
    
}

//task_1()

func task_2() {
    let const: Int = 10
    let num1 = 7
    let num2 = 20
    if num1 * num2 > 10 {
     
        print("num1:\( num1)")
    }
    else{
        print("num2:\( num2)")
    }

}

//task_2()

func task_3() -> Void {
    var k: Int = 9
    for i in 10...50 where i%2 != 0 {
        if (i + k) % 2 == 0 {
            print(i, i + k)
            k += 2
            print("k + 2: \(k)")
        } 
        else {
            print("Next")
            continue
        
        }
    }
}

//task_3()

func task_4() -> Void {
    var k: Int = 9
    for i in 10...50 where i%2 != 0 {
        if (i + k) % 2 == 0 {
            print(i, i + k)
            k += 1
            print("k + 2: \(k)")
        } 
        else {
            print("Next")
            break
        
        }
    }
}

//task_4()


        



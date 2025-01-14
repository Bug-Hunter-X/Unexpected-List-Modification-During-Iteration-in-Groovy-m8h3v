def list = [1, 2, 3, 4, 5]

println list.sum() // Expected output: 15

// Correct approach using iterator
Iterator<Integer> iterator = list.iterator()
while (iterator.hasNext()) {
    def it = iterator.next()
    if (it == 3) {
        iterator.remove()
    }
}

println list.sum() // Correct output: 12

//Alternative approach using removeIf
//This approach is more concise and Groovy-idiomatic
def list2 = [1, 2, 3, 4, 5]
list2.removeIf { it == 3 }
println list2.sum() // Correct output: 12
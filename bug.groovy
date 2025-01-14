def list = [1, 2, 3, 4, 5]

println list.sum() // Expected output: 15

list.each { it ->
    if (it == 3) {
        list.remove(it)
    }
}

println list.sum() // Unexpected output: 12
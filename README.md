# Code ke 4 : 
```
fun WaterCounter(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        var count = 0
        Text("You've had $count glasses.")
        Button(onClick = { count++ }, modifier = Modifier.padding(top = 8.dp)) {
            Text("Add one")
        }
    }
}

Penambahan Pada bagian Column(modifier = Modifier.padding(16.dp) dan Buttom(onClick = { count++ }, modifier = Modifier.padding(top = 8.dp)){
            Text("Add one")```


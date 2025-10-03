Code program
```
# Code ke 4 : 
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
            Text("Add one")

# Code ke 5 :
@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
   Column(modifier = modifier.padding(16.dp)) {
       var count by remember { mutableStateOf(0) }
       Text("You've had $count glasses.")
       Button(onClick = { count++ }, Modifier.padding(top = 8.dp)) {
           Text("Add one")
       }
   }
}

# Code ke 6 :
Set tampilan Ui untuk kondisi tertentu
if (count > 0) {
            Text("You've had $count glasses.")
        }
set keadaan untuk di awal
enabled = count < 10
set keadaan

#Code ke 8 agar saat rotasi data tetap terjaga menggunakan code :
rememberSaveable { mutableStateOf(0) }

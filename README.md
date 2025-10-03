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

#Code ke 8 :
agar saat rotasi data tetap terjaga menggunakan code :
rememberSaveable { mutableStateOf(0) }

#Code Ke 9 :
pemisahan code dengan refactor fun

#code ke 10 :
Work with list code menjadi ada 3
1. @Composable
fun WellnessTaskItem(taskName: String, modifier: Modifier = Modifier) {
    var checkedState by rememberSaveable { mutableStateOf(false) }

    WellnessTaskItem(
        taskName = taskName,
        checked = checkedState,
        onCheckedChange = { newValue -> checkedState = newValue },
        onClose = {}, // we will implement this later!
        modifier = modifier,
    )
}

@Composable
fun WellnessTaskItem(
    taskName: String,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    onClose: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier, verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            modifier = Modifier
                .weight(1f)
                .padding(start = 16.dp),
            text = taskName
        )
        Checkbox(
            checked = checked,
            onCheckedChange = onCheckedChange
        )
        IconButton(onClick = onClose) {
            Icon(Icons.Filled.Close, contentDescription = "Close")
        }
    }
}

2. @Composable
fun WellnessTasksList(
    modifier: Modifier = Modifier,
    list: List<WellnessTask> = remember { getWellnessTasks() }
) {
    LazyColumn(
        modifier = modifier
    ) {
        items(list) { task ->
            WellnessTaskItem(taskName = task.label)
        }
    }
}

fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $i") }

3. data class WellnessTask(val id: Int, val label: String) 

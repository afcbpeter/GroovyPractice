def numbers = 1..10
for (num in numbers) {
    println num
}

def letters = 'a'..'z'
for (var in letters) {
    println var
}

def enum DAYS {
    SUN,
    MON,
    TUE,
    WED,
    THU,
    FRI,
    SAT
}
def weekdays = DAYS.MON..DAYS.FRI
for (days in weekdays) {
    println days
}
println"Extents: "
println weekdays.from
println weekdays.to

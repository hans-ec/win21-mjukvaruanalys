let name 
name = prompt("Vad heter du?")

let age 
age = prompt("Hur gammal är du?")

let date 
date = new Date()

let currentYear
currentYear = date.getFullYear()

let birthYear = currentYear - age
console.log(`Okej ${name}. Du föddes alltså år ${birthYear}.`)

let hasChildren 
hasChildren = prompt("Har du några barn?")

if (hasChildren.toLowerCase() === "ja") {
    let childrenAmount 
    childrenAmount = prompt("Hur många barn har du? ")
    console.log(`Trevligt med ${childrenAmount} barn. Själv har jag inga barn då jag är ett program.`)

} else {
    console.log("Inte jag heller, för att jag är ett program.")
}

    
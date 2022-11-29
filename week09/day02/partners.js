let classList = [ 'Rina', 'Brian', 'NaDario', 'Preston', 'Aaliyah', 'Raymond', 'Brandon', 'Lamar', 'Aung', 'Donovan', 'Edwin', 'Christopher', 'Dylan', 'Victoria', 'Rob', 'Eric', 'Jordan', 'Artyom', 'Kirby', 'Jason', 'Kelvin' ];

let groups = [[], [], [], [], [], [], [], [], [], []];

while(classList.length !== 0) {
    let group = Math.floor(Math.random() * 10);
    if (classList.length == 1)
        groups[group].push(classList.shift());
    if (groups[group].length < 2)
        groups[group].push(classList.shift());
}

console.log(groups);
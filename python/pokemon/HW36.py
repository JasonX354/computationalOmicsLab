#!/usr/bin/python
print("Content-Type: text/html\n\n")

def pokemontable(data):
    table = "<table border = 1>\n"
    for list in data:
        table += "\t<tr>"
        for item in list:
            table += "<td>" + str(item) + "</td>"
        table += "</tr>\n"
    table += "</table>"
    return table

with open("img/front/1.png", "r"):
    image = "<img src = \"img/front/1.png\">"

with open("pokemon.csv", "r") as text:
    pokemons = []
    for i in range(152):
        with open("img/front/" + str(i) + ".png", "r"):
            with open("img/back/" + str(i) + ".png", "r"):
                temp_pokemons = []
                if i == 0:
                    temp_pokemons.append("Front")
                    temp_pokemons.append("Back")
                else: 
                    temp_pokemons.append("<img src = \"img/front/" + str(i) + ".png\">")
                    temp_pokemons.append("<img src = \"img/back/" + str(i) + ".png\">")
            for data in (text.readline()).split(","):
                temp_pokemons.append(data)
            pokemons.append(temp_pokemons)
    

    webpage = '''
    <html>
        <head>
            <style>
		body {
		    background-color: Tomato
		}
                p {
                    color: WhiteSmoke;
		    font-size: 100%;
                    font-family: "Arial";
                }
                h1{
                    font-size: 500%;
		    font-family: "Impact";
                }
		table {
		    background-color: WhiteSmoke;
		    font-family: "Calibri";
		}
            </style>
        </head>
        <body>
            <center><h1><font>POKEMONS</font></h1></center>
            <center><p>Pokemon is a wholesome game for family and kids as children are taught to run away from home to capture wild animals without consent. The game teaches valuable life lessons to the kids, while parents are free to let video games raise their children (as all excellent parents of the 21st century do). 151/10, one point for each pokemon. Below is a table containing information on every 151 pokemons, from their front and back view to their names to their stats. Note: Charizard is pokemon number 6, all other pokemon are irrelevant.</p></center>
            <center>
                TABLE
            </center>
            <br/>
        </body>
    </html>
    '''
    webpage = webpage.replace("TABLE", pokemontable(pokemons))
    print(webpage)


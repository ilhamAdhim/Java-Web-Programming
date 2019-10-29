
<%! int consonant; int vowels; int amountChar;%>
<%! String word; %>
<%! String [] wordsLetter; %>

<%-- Adhim Muhammad Ilham --%>
<%-- 1917319 --%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Analysis Result</title>
</head>
<body>
    <center> A Word Analyzer <br><br>
    <% word = request.getParameter("word"); %>
    <% wordsLetter =  word.split(""); %>
    <% for(int i = 0 ; i<wordsLetter.length; i++){
        if(wordsLetter[i].equalsIgnoreCase("a") || wordsLetter[i].equalsIgnoreCase("i") || wordsLetter[i].equalsIgnoreCase("u") || wordsLetter[i].equalsIgnoreCase("e") || wordsLetter[i].equalsIgnoreCase("o") ){ 
            ++vowels;
            ++amountChar;
         } 
        else if(wordsLetter[i].equalsIgnoreCase(" ")){
            continue;
        }
        else {
            ++consonant;
            ++amountChar;
        }
     } %> 

    Word : <%=word %> <br>
    Vowels : <%=vowels %><br>
    Consonants : <%=consonant%><br>
    No of characters : <%=amountChar %>

    <% consonant = 0; vowels = 0; %>
    </center>
</body>
</html>
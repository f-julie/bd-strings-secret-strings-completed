# String Manipulation: Song Scramble

We're going to play a word game to remix the nursery rhyme 
"Row, row, row your boat".

The way this game works is to prompt the user for several parts of
speech to fill in the blanks of our template. Then we can read the
paragraph back to the user and see how ridiculous it sounds.

The template we will be using is as follows:

```
VERB_1, VERB_1, VERB_1 your NOUN_1
gently down the NOUN_2.
ADVERB_1 ADVERB_1 ADVERB_1 ADVERB_1, life is but a NOUN_3
```

## Starting Code:

You are provided with the non-blank portions of the stanzas in the
template above.
You are also provided with System.out prompts for the user to input
a part of speech (Noun, Verb, Adverb).

At the bottom we output the completed song by combining the three stanzas.

## Instructions

Your task will be to collect user input and store the data in String
variables. Then use three different methods of string concatenation
to complete the three stanzas (`beginning`, `middle`, and `end`).

#### Requirements

- Use the addition operator `+` to complete the `beginning` stanza
- Use the `String.concat()` method to complete the `middle` stanza
- Use `String.format()` to complete the `end` stanza.

## A Completed Project Will:

prompt the user for a verb, noun, noun, adverb, noun.
produce a completed song using the provided words.

Example input:
- Verb `run`
- Noun 1 `frog`
- Noun 2 `table`
- Adverb `quickly`
- Noun 3 `shoe`

Output:

```
run, run, run your frog
gently down the table.
quickly, quickly, quickly, quickly, life is but a shoe.
```

## Extension

Capitalize the first letter of both sentences.

**HINT**
You can add/subtract from `char`s. Each character is associated with
an ASCII value, an integer that corresponds to its symbol in the ASCII
table.

The character `a` is ASCII value 97.
The character `b` is `98` and so on.
The uppercase `A` is at ASCII value `65`.

[ASCII table reference](https://www.asciitable.com/)
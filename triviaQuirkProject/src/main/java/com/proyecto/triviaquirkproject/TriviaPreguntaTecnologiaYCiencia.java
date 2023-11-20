/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.triviaquirkproject;

/**
 * Enumeración que contiene preguntas de historia con opciones de respuesta y respuestas correctas.
 * Cada pregunta está representada como una constante del enumerador.
 *
 * @author Nahúm
 */
public enum TriviaPreguntaTecnologiaYCiencia {
    PREGUNTA_1("¿Quién es considerado el padre de la informática?", "1) Alan Turing", "2) Bill Gates", "3) Steve Jobs", (byte)1),
    PREGUNTA_2("¿En qué año se lanzó el primer satélite artificial, el Sputnik 1?", "1) 1957", "2) 1961", "3) 1950", (byte)1),
    PREGUNTA_3("¿Cuál es el componente básico de un circuito electrónico?", "1) Resistencia", "2) Transistor", "3) Condensador", (byte)2),
    PREGUNTA_4("¿Quién desarrolló la teoría de la relatividad?", "1) Isaac Newton", "2) Albert Einstein", "3) Niels Bohr", (byte)2),
    PREGUNTA_5("¿En qué año se fundó la NASA?", "1) 1958", "2) 1965", "3) 1972", (byte)1),
    PREGUNTA_6("¿Cuál es el componente principal de la atmósfera terrestre?", "1) Nitrógeno", "2) Oxígeno", "3) Dióxido de carbono", (byte)1),
    PREGUNTA_7("¿Qué científico propuso la teoría heliocéntrica, que sitúa al Sol en el centro del sistema solar?", "1) Galileo Galilei", "2) Johannes Kepler", "3) Nicolás Copérnico", (byte)3),
    PREGUNTA_8("¿Cuál es la unidad básica de almacenamiento en una computadora?", "1) Bit", "2) Byte", "3) Megabyte", (byte)1),
    PREGUNTA_9("¿Quién fue el cofundador de Microsoft junto a Bill Gates?", "1) Steve Jobs", "2) Paul Allen", "3) Mark Zuckerberg", (byte)2),
    PREGUNTA_10("¿Qué científico descubrió la estructura de doble hélice del ADN?", "1) James Watson", "2) Francis Crick", "3) Rosalind Franklin", (byte)2),
    PREGUNTA_11("¿Cuál es la ley fundamental de la electricidad?", "1) Ley de Ohm", "2) Ley de Gauss", "3) Ley de Faraday", (byte)1),
    PREGUNTA_12("¿Qué inventor desarrolló la primera lámpara incandescente práctica?", "1) Thomas Edison", "2) Nikola Tesla", "3) Alexander Graham Bell", (byte)1),
    PREGUNTA_13("¿En qué año se lanzó el primer teléfono móvil comercial?", "1) 1973", "2) 1985", "3) 1990", (byte)1),
    PREGUNTA_14("¿Cuál es la partícula subatómica con carga positiva?", "1) Electrón", "2) Protón", "3) Neutrón", (byte)2),
    PREGUNTA_15("¿Quién fue el fundador de Apple Inc.?", "1) Steve Jobs", "2) Steve Wozniak", "3) Bill Gates", (byte)1),
    PREGUNTA_16("¿Cuál es la velocidad de la luz en el vacío?", "1) 299,792 kilómetros por segundo", "2) 150,000 kilómetros por segundo", "3) 450,000 kilómetros por segundo", (byte)1),
    PREGUNTA_17("¿Cuál es el componente esencial en la generación de energía nuclear en una central nuclear?", "1) Uranio", "2) Plutonio", "3) Torio", (byte)1),
    PREGUNTA_18("¿Quién propuso la teoría cuántica?", "1) Max Planck", "2) Werner Heisenberg", "3) Niels Bohr", (byte)1),
    PREGUNTA_19("¿En qué año se llevó a cabo el primer vuelo humano controlado?", "1) 1903", "2) 1910", "3) 1925", (byte)1),
    PREGUNTA_20("¿Qué científico formuló la teoría de la evolución por selección natural?", "1) Charles Darwin", "2) Gregor Mendel", "3) Lamarck", (byte)1),
    PREGUNTA_21("¿Cuál es el componente principal en la fabricación de circuitos integrados?", "1) Silicio", "2) Oro", "3) Aluminio", (byte)1),
    PREGUNTA_22("¿Quién inventó el World Wide Web (WWW)?", "1) Tim Berners-Lee", "2) Mark Zuckerberg", "3) Larry Page", (byte)1),
    PREGUNTA_23("¿Cuál es el elemento más abundante en la corteza terrestre?", "1) Oxígeno", "2) Silicio", "3) Aluminio", (byte)2),
    PREGUNTA_24("¿En qué año se realizó el primer vuelo espacial humano?", "1) 1961", "2) 1957", "3) 1969", (byte)1),
    PREGUNTA_25("¿Cuál es el proceso de conversión de información analógica a digital?", "1) Digitalización", "2) Modulación", "3) Digitalización", (byte)3),
    PREGUNTA_26("¿Quién es conocido como el 'padre de la computación'?", "1) Charles Babbage", "2) Ada Lovelace", "3) Konrad Zuse", (byte)1),
    PREGUNTA_27("¿Cuál es el componente principal en la fabricación de baterías recargables?", "1) Litio", "2) Plomo", "3) Níquel", (byte)1),
    PREGUNTA_28("¿Quién fue el pionero en la investigación sobre la radiactividad?", "1) Marie Curie", "2) Pierre Curie", "3) Henri Becquerel", (byte)3),
    PREGUNTA_29("¿En qué año se lanzó el primer navegador web, llamado WorldWideWeb?", "1) 1990", "2) 1985", "3) 1993", (byte)1),
    PREGUNTA_30("¿Cuál es el principio fundamental de la teoría de la relatividad general de Einstein?", "1) La gravedad es causada por la curvatura del espacio-tiempo", "2) La luz se comporta como partícula y onda al mismo tiempo", "3) La masa y la energía son equivalentes (E=mc^2)", (byte)1); 
    
    private final String pregunta;
    private final String respuestaA;
    private final String respuestaB;
    private final String respuestaC;
    private final byte respuestaCorrecta;

    /**
     * Constructor privado para inicializar los atributos de cada constante del enumerador.
     *
     * @param pregunta            El enunciado de la pregunta.
     * @param respuestaA          Opción A de respuesta.
     * @param respuestaB          Opción B de respuesta.
     * @param respuestaC          Opción C de respuesta.
     * @param respuestaCorrecta   El byte que identifica la respuesta correcta (1 para A, 2 para B, 3 para C).
     */
    private TriviaPreguntaTecnologiaYCiencia(String pregunta, String respuestaA, String respuestaB, String respuestaC, byte respuestaCorrecta) {
        this.pregunta = pregunta;
        this.respuestaA = respuestaA;
        this.respuestaB = respuestaB;
        this.respuestaC = respuestaC;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    /**
     * Obtiene el enunciado de la pregunta.
     *
     * @return El enunciado de la pregunta.
     */
    public String getPregunta() {
        return this.pregunta;
    }

    /**
     * Obtiene la opción A de respuesta.
     *
     * @return Opción A de respuesta.
     */
    public String getRespuestaA() {
        return this.respuestaA;
    }

    /**
     * Obtiene la opción B de respuesta.
     *
     * @return Opción B de respuesta.
     */
    public String getRespuestaB() {
        return this.respuestaB;
    }

    /**
     * Obtiene la opción C de respuesta.
     *
     * @return Opción C de respuesta.
     */
    public String getRespuestaC() {
        return this.respuestaC;
    }

    /**
     * Obtiene la respuesta correcta identificada por un byte (1 para A, 2 para B, 3 para C).
     *
     * @return La respuesta correcta.
     */
    public byte getRespuestaCorrecta() {
        return this.respuestaCorrecta;
    }
}

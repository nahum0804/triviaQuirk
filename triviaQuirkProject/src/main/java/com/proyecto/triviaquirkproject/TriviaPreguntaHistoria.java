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
public enum TriviaPreguntaHistoria {
    PREGUNTA_1("¿Quién fue el primer presidente de los Estados Unidos?", "1) George Washington", "2) Thomas Jefferson", "3) Abraham Lincoln", (byte)1),
    PREGUNTA_2("En qué año comenzó la Primera Guerra Mundial?", "1) 1914", "2) 1918", "3) 1922", (byte)1),
    PREGUNTA_3("¿Cuál fue la civilización dominante en el antiguo Egipto?", "1) Mesopotamia", "2) Griega", "3) Egipcia", (byte)3),
    PREGUNTA_4("¿Qué evento histórico ocurrió en 1492?", "1) Descubrimiento de América por Cristóbal Colón", "2) Revolución Francesa", "3) Independencia de México", (byte)1),
    PREGUNTA_5("¿Quién fue el líder de la Revolución Rusa de 1917?", "1) Lenin", "2) Stalin", "3) Trotsky", (byte)1),
    PREGUNTA_6("¿En qué año se firmó la Declaración de Independencia de los Estados Unidos?", "1) 1776", "2) 1789", "3) 1804", (byte)1),
    PREGUNTA_7("¿Cuál fue la causa principal de la Guerra de Secesión en los Estados Unidos?", "1) Esclavitud", "2) Comercio internacional", "3) Impuestos excesivos", (byte)1),
    PREGUNTA_8("¿Quién fue el líder de la Revolución Cubana en 1959?", "1) Fidel Castro", "2) Che Guevara", "3) Batista", (byte)1),
    PREGUNTA_9("¿En qué año terminó la Segunda Guerra Mundial?", "1) 1945", "2) 1941", "3) 1939", (byte)1),
    PREGUNTA_10("¿Quién fue el líder de la Revolución Francesa?", "1) Robespierre", "2) Napoleón Bonaparte", "3) Luis XVI", (byte)1),
    PREGUNTA_11("¿Cuál fue la batalla decisiva de la Guerra del Pacífico?", "1) Batalla de Iquique", "2) Batalla de Arica", "3) Batalla de Angamos", (byte)3),
    PREGUNTA_12("¿En qué año se firmó el Tratado de Versalles que puso fin a la Primera Guerra Mundial?", "1) 1919", "2) 1921", "3) 1923", (byte)1),
    PREGUNTA_13("¿Cuál fue el imperio más grande de la historia?", "1) Romano", "2) Mongol", "3) Otomano", (byte)2),
    PREGUNTA_14("¿Quién fue la primera mujer en ganar un Premio Nobel?", "1) Marie Curie", "2) Amelia Earhart", "3) Eleanor Roosevelt", (byte)1),
    PREGUNTA_15("¿Qué evento histórico marcó el comienzo de la Edad Media?", "1) Caída del Imperio Romano", "2) Renacimiento", "3) Revolución Industrial", (byte)1),
    PREGUNTA_16("¿Cuál fue el líder de la Revolución China en 1949?", "1) Mao Zedong", "2) Chiang Kai-shek", "3) Sun Yat-sen", (byte)1),
    PREGUNTA_17("¿Quién fue el arquitecto principal de la Revolución Mexicana?", "1) Emiliano Zapata", "2) Francisco Madero", "3) Pancho Villa", (byte)2),
    PREGUNTA_18("¿En qué año se firmó la Declaración de Derechos Humanos de la ONU?", "1) 1948", "2) 1955", "3) 1961", (byte)1),
    PREGUNTA_19("¿Quién fue el presidente de Estados Unidos durante la Guerra Civil estadounidense?", "1) Abraham Lincoln", "2) Ulysses S. Grant", "3) Andrew Johnson", (byte)1),
    PREGUNTA_20("¿Cuál fue el resultado de la Revolución Industrial en el siglo XIX?", "1) Aumento de la producción industrial", "2) Declive de la agricultura", "3) Expansión del feudalismo", (byte)1),
    PREGUNTA_21("¿En qué año se firmó el Tratado de Trianón que puso fin a la Primera Guerra Mundial para Hungría?", "1) 1920", "2) 1919", "3) 1921", (byte)1),
    PREGUNTA_22("¿Quién fue el líder de la Revolución Bolchevique en 1917?", "1) Vladimir Lenin", "2) Joseph Stalin", "3) Leon Trotsky", (byte)1),
    PREGUNTA_23("¿Qué líder militar dirigió la expedición del Granma en 1956, que marcó el inicio de la Revolución Cubana?", "1) Fidel Castro", "2) Che Guevara", "3) Camilo Cienfuegos", (byte)1),
    PREGUNTA_24("¿Cuándo se llevó a cabo la Revolución Industrial en Inglaterra?", "1) Siglo XVII", "2) Siglo XVIII", "3) Siglo XIX", (byte)3),
    PREGUNTA_25("¿Quién fue el fundador del Imperio Mongol en el siglo XIII?", "1) Genghis Khan", "2) Kublai Khan", "3) Attila", (byte)1),
    PREGUNTA_26("¿En qué año se proclamó la independencia de India del dominio británico?", "1) 1942", "2) 1947", "3) 1950", (byte)2),
    PREGUNTA_27("¿Cuál fue la batalla clave durante la Guerra de Independencia de Estados Unidos?", "1) Saratoga", "2) Yorktown", "3) Lexington y Concord", (byte)2),
    PREGUNTA_28("¿Cuándo se llevó a cabo la Revolución Rusa de Febrero?", "1) 1917", "2) 1918", "3) 1920", (byte)1),
    PREGUNTA_29("¿Quién fue el líder militar y político de la independencia de Panamá de Colombia en 1903?", "1) Simón Bolívar", "2) José Martí", "3) Manuel Amador Guerrero", (byte)3),
    PREGUNTA_30("¿En qué año se firmó el Tratado de Paz de Westfalia, que puso fin a la Guerra de los Treinta Años?", "1) 1648", "2) 1600", "3) 1672", (byte)1);

    
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
    private TriviaPreguntaHistoria(String pregunta, String respuestaA, String respuestaB, String respuestaC, byte respuestaCorrecta) {
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

package com.example.sistemasolarapp.util

import com.example.sistemasolarapp.model.Solar

object SolarRepository {

    fun getAll(): List<Solar>{
        return listOf(
            Solar("Mercurio","Mercúrio é o menor e mais interno planeta do Sistema Solar, orbitando o Sol a cada 87,969 dias terrestres.\n" +
                    "Mercúrio tem uma aparência similar à da Lua com crateras de impacto e planícies lisas, não possuindo satélites naturais nem uma atmosfera substancial."),
            Solar("Venus","Vênus (português europeu) ou Vênus (português brasileiro) (AO 1990: Vénus ou Vênus é o segundo planeta do Sistema Solar em ordem de distância a partir do Sol, orbitando-o a cada 224,7 dias.\n" +
                    "Depois da Lua, é o objeto mais brilhante do céu noturno, atingindo uma magnitude aparente de -4,6, o suficiente para produzir sombras.\n" +
                    "Vénus é considerado um planeta do tipo terrestre ou telúrico, chamado com frequência de planeta irmão da Terra."),
            Solar("Terra","A Terra é o terceiro planeta mais próximo do Sol, o mais denso e o quinto maior dos oito planetas do Sistema Solar. \n" +
                    "É também o maior dos quatro planetas telúricos. É por vezes designada como Mundo ou Planeta Azul."),
            Solar("Marte","Marte é o quarto planeta a partir do Sol, o segundo menor do Sistema Solar. Batizado em homenagem ao deus romano da guerra, muitas vezes é descrito como o \"Planeta Vermelho\", \n" +
                    "porque o óxido de ferro predominante em sua superfície lhe dá uma aparência avermelhada."),
            Solar("Jupiter","Júpiter é o maior planeta do Sistema Solar, tanto em diâmetro quanto em massa, e é o quinto mais próximo do Sol.\n" +
                    "Possui menos de um milésimo da massa solar, contudo tem 2,5 vezes a massa de todos os outros planetas em conjunto.\n" +
                    "É um planeta gasoso, junto com Saturno, Urano e Netuno."),
            Solar("Saturno","Saturno é o sexto planeta a partir do Sol e o segundo maior do Sistema Solar atrás de Júpiter. Pertencente ao grupo" +
                    " dos gigantes gasosos, possui cerca de 95 massas terrestres e orbita a uma distância média de 9,5 unidades astronômicas."),
            Solar("Urano","Urano é o sétimo planeta a partir do Sol, o terceiro maior e o quarto mais massivo dos oito planetas do Sistema Solar." +
                    " Foi nomeado em homenagem ao deus grego do céu, Urano, o pai de Cronos (Saturno) e o avô de Zeus (Júpiter)."),
            Solar("Neturno","Netuno é o oitavo planeta do Sistema Solar, o último a partir do Sol desde a reclassificação de Plutão para a categoria de planeta anão, em 2006. \n" +
                    "Pertencente ao grupo dos gigantes gasosos, possui um tamanho ligeiramente menor que o de Urano, mas maior massa, equivalente a 17 massas terrestres. Netuno orbita o Sol" +
                    " a uma distância média de 30,1 unidades astronômicas.")
        )
    }
}
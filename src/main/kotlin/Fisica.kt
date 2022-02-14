import kotlin.math.pow

class Fisica {
    fun calcularForcaPeso(massa: Float, gravidade: Float): Float {
        return (massa * gravidade)
    }

    fun CalcularForcaCentripeta(velocidade: Float,raio: Float, massa: Float): Float {
        return (velocidade * velocidade)  / (raio * massa)
    }

    fun CalcularImpulso(tempoInicial: Float, tempoFinal: Float, movimentoInicial: Float, movimentoFinal: Float): Float {
        return (tempoInicial - tempoFinal) * (movimentoInicial - movimentoFinal)
    }

    fun calcularForcaElastica(constanteElastica: Float, alongamentoDaMola: Float): Float {
        return constanteElastica * alongamentoDaMola
    }

    fun calcularVelociDadeMedia(distanciaPercorrida: Float, intervaloDeTempo: Float): Float {
        return distanciaPercorrida / intervaloDeTempo
    }

    fun calcularMru(posicaoInicial: Float, velocidade: Float, intervaloDeTempo: Float): Float {
        return posicaoInicial + (velocidade * intervaloDeTempo)
    }

    fun calcularMruv(posicaoInicial: Float, velocidadeInicial: Float, tempo: Float, aceleracao: Float): Float {
        return posicaoInicial + (velocidadeInicial * tempo) + (aceleracao * tempo.pow(2) / 2)
    }
}

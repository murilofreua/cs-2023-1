function totalPagar (ipi, cod1, valor1, quant1, cod2, valor2, quant2) {
    console.log(((valor1*quant1 + valor2*quant2)*(ipi/100 + 1)).toFixed(2));
}

totalPagar(10, 1, 200, 3, 2, 150, 5);
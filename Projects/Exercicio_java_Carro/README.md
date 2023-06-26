# Exercicio java Carro<br>
<strong>Implemente uma classe Carro com as seguintes propriedades:
 <ul>
 <li> Um veículo tem um certo consumo de combustível e uma certa quantidade de combustível no tanque.
 <li> O consumo é especificado no construtor e o nível de combustível inicial é 0. 
 <li> Forneça um método andar que simule o ato de dirigir o veículo por uma certa distância, reduzindo o nível de
      combustível no tanque de gasolina, e os métodos obterGasolina, que devolvam o nívelatual de combustível, e 
      adicionarGasolina, para abastecer o tanque.</strong>
 
<strong>Exemplo de uso:<strong><br>
Carro ferrari = new Carro(5);<strong>//Consumo de 5 km/l<br>
ferrari.adicionarGasolina(50); //Abastece 50 litros<br>
ferrari.andar(10); // Anda 10 km<br>
System.out.println("Tanque Ferrari:" + ferrari.obterGasolina()); //Imprime o combustível que resta.<br>

package com.ejercicio.soap;

public class OperationProcessor {

	public OperationOutput resta(OperationInput input) throws Exception {

		OperationOutput output = new OperationOutput();
		output.setResult(input.elementoUno - input.elementoDos);
		output.setStatus("OK");

		return output;
	}

	public OperationOutput suma(OperationInput input) throws Exception {

		OperationOutput output = new OperationOutput();
		output.setResult(input.elementoUno + input.elementoDos);
		output.setStatus("OK");

		return output;
	}

	public OperationInput prepareList(String elemenone, String elemtwo) {
		OperationInput input = new OperationInput();
		input.setElementoUno(Integer.parseInt(elemenone));
		input.setElementoDos(Integer.parseInt(elemtwo));

		return input;
	}

}

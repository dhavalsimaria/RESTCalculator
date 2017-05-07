/**
 * 
 */
package org.dhaval.angRest.calculator.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author dhavalsimaria
 *
 */
@XmlRootElement
public class Data {
	private double input1;
	private double input2;
	private double result;
	
	/** Default constructor */
	public Data() {
		
	}
	
	/** Parameterized Constructor */
	public Data(double input1, double input2, double result) {
		this.input1 = input1;
		this.input2 = input2;
		this.result = result;
	}

	public double getInput1() {
		return input1;
	}
	public void setInput1(double input1) {
		this.input1 = input1;
	}
	public double getInput2() {
		return input2;
	}
	public void setInput2(double input2) {
		this.input2 = input2;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	
}

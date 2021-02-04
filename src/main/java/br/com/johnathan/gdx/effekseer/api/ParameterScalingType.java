/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package br.com.johnathan.gdx.effekseer.api;

public final class ParameterScalingType {
	public final static ParameterScalingType ParameterScalingType_Fixed = new ParameterScalingType("ParameterScalingType_Fixed", GDXJNI.ParameterScalingType_Fixed_get());
	public final static ParameterScalingType ParameterScalingType_PVA = new ParameterScalingType("ParameterScalingType_PVA", GDXJNI.ParameterScalingType_PVA_get());
	public final static ParameterScalingType ParameterScalingType_Easing = new ParameterScalingType("ParameterScalingType_Easing", GDXJNI.ParameterScalingType_Easing_get());
	public final static ParameterScalingType ParameterScalingType_SinglePVA = new ParameterScalingType("ParameterScalingType_SinglePVA", GDXJNI.ParameterScalingType_SinglePVA_get());
	public final static ParameterScalingType ParameterScalingType_SingleEasing = new ParameterScalingType("ParameterScalingType_SingleEasing", GDXJNI.ParameterScalingType_SingleEasing_get());
	public final static ParameterScalingType ParameterScalingType_FCurve = new ParameterScalingType("ParameterScalingType_FCurve", GDXJNI.ParameterScalingType_FCurve_get());
	public final static ParameterScalingType ParameterScalingType_None = new ParameterScalingType("ParameterScalingType_None", GDXJNI.ParameterScalingType_None_get());
	public final static ParameterScalingType ParameterScalingType_DWORD = new ParameterScalingType("ParameterScalingType_DWORD", GDXJNI.ParameterScalingType_DWORD_get());
	
	public final int swigValue() {
		return swigValue;
	}
	
	public String toString() {
		return swigName;
	}
	
	public static ParameterScalingType swigToEnum(int swigValue) {
		if(swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue) return swigValues[swigValue];
		for (int i = 0; i < swigValues.length; i++)
			if(swigValues[i].swigValue == swigValue) return swigValues[i];
		throw new IllegalArgumentException("No enum " + ParameterScalingType.class + " with value " + swigValue);
	}
	
	private ParameterScalingType(String swigName) {
		this.swigName = swigName;
		this.swigValue = swigNext++;
	}
	
	private ParameterScalingType(String swigName, int swigValue) {
		this.swigName = swigName;
		this.swigValue = swigValue;
		swigNext = swigValue + 1;
	}
	
	private ParameterScalingType(String swigName, ParameterScalingType swigEnum) {
		this.swigName = swigName;
		this.swigValue = swigEnum.swigValue;
		swigNext = this.swigValue + 1;
	}
	
	private static ParameterScalingType[] swigValues = { 
			ParameterScalingType_Fixed, 
			ParameterScalingType_PVA, 
			ParameterScalingType_Easing,
			ParameterScalingType_SinglePVA, 
			ParameterScalingType_SingleEasing, 
			ParameterScalingType_FCurve, 
			ParameterScalingType_None,
			ParameterScalingType_DWORD 
	};
	private static int swigNext = 0;
	private final int swigValue;
	private final String swigName;
}

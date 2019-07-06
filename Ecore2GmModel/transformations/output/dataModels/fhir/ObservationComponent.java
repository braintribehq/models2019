/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ObservationComponent of the Data Model fhir.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package fhir;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link code}, 
{@link valueQuantity}, 
{@link valueCodeableConcept}, 
{@link valueRange}, 
{@link valueRatio}, 
{@link valueSampledData}, 
{@link valuePeriod}, 
{@link dataAbsentReason}, 
{@link interpretation}, 
{@link referenceRange}, 

* It provides of then following operations (getters and setters)
{@link getCode},
{@link getValueQuantity},
{@link getValueCodeableConcept},
{@link getValueRange},
{@link getValueRatio},
{@link getValueSampledData},
{@link getValuePeriod},
{@link getDataAbsentReason},
{@link getInterpretation},
{@link getReferenceRange},
{@link setCode},
{@link setValueQuantity},
{@link setValueCodeableConcept},
{@link setValueRange},
{@link setValueRatio},
{@link setValueSampledData},
{@link setValuePeriod},
{@link setDataAbsentReason},
{@link setInterpretation},
{@link setReferenceRange},
 */

@Description("Measurements and simple assertions made about a patient, device or other subject.")

public interface ObservationComponent extends GenericEntity, fhir.BackboneElement {

	EntityType<ObservationComponent> T = EntityTypes.T(ObservationComponent.class);

	/* Constants for each property name. */
	java.lang.String code = "code";
	java.lang.String valueQuantity = "valueQuantity";
	java.lang.String valueCodeableConcept = "valueCodeableConcept";
	java.lang.String valueRange = "valueRange";
	java.lang.String valueRatio = "valueRatio";
	java.lang.String valueSampledData = "valueSampledData";
	java.lang.String valuePeriod = "valuePeriod";
	java.lang.String dataAbsentReason = "dataAbsentReason";
	java.lang.String interpretation = "interpretation";
	java.lang.String referenceRange = "referenceRange";

	@Description("Describes what was observed. Sometimes this is called the observation 'code'.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
	@Description("")
	@Mandatory
	fhir.Quantity getValueQuantity();
	void setValueQuantity(fhir.Quantity valueQuantity);
	@Description("")
	@Mandatory
	fhir.CodeableConcept getValueCodeableConcept();
	void setValueCodeableConcept(fhir.CodeableConcept valueCodeableConcept);
	@Description("")
	@Mandatory
	fhir.Range getValueRange();
	void setValueRange(fhir.Range valueRange);
	@Description("")
	@Mandatory
	fhir.Ratio getValueRatio();
	void setValueRatio(fhir.Ratio valueRatio);
	@Description("")
	@Mandatory
	fhir.SampledData getValueSampledData();
	void setValueSampledData(fhir.SampledData valueSampledData);
	@Description("")
	@Mandatory
	fhir.Period getValuePeriod();
	void setValuePeriod(fhir.Period valuePeriod);
	@Description("Provides a reason why the expected value in the element Observation.component.value[x] is missing.")
	@Mandatory
	fhir.CodeableConcept getDataAbsentReason();
	void setDataAbsentReason(fhir.CodeableConcept dataAbsentReason);
	@Description("A categorical assessment of an observation value.  For example, high, low, normal.")
	
	java.util.List<fhir.CodeableConcept> getInterpretation();
	void setInterpretation(java.util.List<fhir.CodeableConcept> interpretation);

	@Description("Guidance on how to interpret the value by comparison to a normal or recommended range.")
	
	java.util.List<fhir.ObservationReferenceRange> getReferenceRange();
	void setReferenceRange(java.util.List<fhir.ObservationReferenceRange> referenceRange);

}

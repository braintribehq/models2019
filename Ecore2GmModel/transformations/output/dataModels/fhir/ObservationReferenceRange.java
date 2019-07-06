/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ObservationReferenceRange of the Data Model fhir.
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
{@link low}, 
{@link high}, 
{@link type}, 
{@link appliesTo}, 
{@link age}, 

* It provides of then following operations (getters and setters)
{@link getLow},
{@link getHigh},
{@link getType},
{@link getAppliesTo},
{@link getAge},
{@link setLow},
{@link setHigh},
{@link setType},
{@link setAppliesTo},
{@link setAge},
 */

@Description("Measurements and simple assertions made about a patient, device or other subject.")

public interface ObservationReferenceRange extends GenericEntity, fhir.BackboneElement {

	EntityType<ObservationReferenceRange> T = EntityTypes.T(ObservationReferenceRange.class);

	/* Constants for each property name. */
	java.lang.String low = "low";
	java.lang.String high = "high";
	java.lang.String type = "type";
	java.lang.String appliesTo = "appliesTo";
	java.lang.String age = "age";

	@Description("The value of the low bound of the reference range.  The low bound of the reference range endpoint is inclusive of the value (e.g.  reference range is >=5 - <=9). If the low bound is omitted,  it is assumed to be meaningless (e.g. reference range is <=2.3).")
	@Mandatory
	fhir.Quantity getLow();
	void setLow(fhir.Quantity low);
	@Description("The value of the high bound of the reference range.  The high bound of the reference range endpoint is inclusive of the value (e.g.  reference range is >=5 - <=9). If the high bound is omitted,  it is assumed to be meaningless (e.g. reference range is >= 2.3).")
	@Mandatory
	fhir.Quantity getHigh();
	void setHigh(fhir.Quantity high);
	@Description("Codes to indicate the what part of the targeted reference population it applies to. For example, the normal or therapeutic range.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("Codes to indicate the target population this reference range applies to.  For example, a reference range may be based on the normal population or a particular sex or race.  Multiple `appliesTo`  are interpreted as an 'AND' of the target populations.  For example, to represent a target population of African American females, both a code of female and a code for African American would be used.")
	
	java.util.List<fhir.CodeableConcept> getAppliesTo();
	void setAppliesTo(java.util.List<fhir.CodeableConcept> appliesTo);

	@Description("The age at which this reference range is applicable. This is a neonatal age (e.g. number of weeks at term) if the meaning says so.")
	@Mandatory
	fhir.Range getAge();
	void setAge(fhir.Range age);
}

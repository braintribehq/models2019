/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ObservationDefinitionQualifiedInterval of the Data Model fhir.
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
{@link range}, 
{@link context}, 
{@link appliesTo}, 
{@link age}, 
{@link gestationalAge}, 

* It provides of then following operations (getters and setters)
{@link getRange},
{@link getContext},
{@link getAppliesTo},
{@link getAge},
{@link getGestationalAge},
{@link setRange},
{@link setContext},
{@link setAppliesTo},
{@link setAge},
{@link setGestationalAge},
 */

@Description("Set of definitional characteristics for a kind of observation or measurement produced or consumed by an orderable health care service.")

public interface ObservationDefinitionQualifiedInterval extends GenericEntity, fhir.BackboneElement {

	EntityType<ObservationDefinitionQualifiedInterval> T = EntityTypes.T(ObservationDefinitionQualifiedInterval.class);

	/* Constants for each property name. */
	java.lang.String range = "range";
	java.lang.String context = "context";
	java.lang.String appliesTo = "appliesTo";
	java.lang.String age = "age";
	java.lang.String gestationalAge = "gestationalAge";

	@Description("The low and high values determining the interval. There may be only one of the two.")
	@Mandatory
	fhir.Range getRange();
	void setRange(fhir.Range range);
	@Description("Codes to indicate the health context the range applies to. For example, the normal or therapeutic range.")
	@Mandatory
	fhir.CodeableConcept getContext();
	void setContext(fhir.CodeableConcept context);
	@Description("Codes to indicate the target population this reference range applies to.")
	
	java.util.List<fhir.CodeableConcept> getAppliesTo();
	void setAppliesTo(java.util.List<fhir.CodeableConcept> appliesTo);

	@Description("The age at which this reference range is applicable. This is a neonatal age (e.g. number of weeks at term) if the meaning says so.")
	@Mandatory
	fhir.Range getAge();
	void setAge(fhir.Range age);
	@Description("The gestational age to which this reference range is applicable, in the context of pregnancy.")
	@Mandatory
	fhir.Range getGestationalAge();
	void setGestationalAge(fhir.Range gestationalAge);
}

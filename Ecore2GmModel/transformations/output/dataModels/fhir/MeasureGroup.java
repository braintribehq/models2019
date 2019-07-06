/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MeasureGroup of the Data Model fhir.
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
{@link population}, 
{@link stratifier}, 

* It provides of then following operations (getters and setters)
{@link getCode},
{@link getPopulation},
{@link getStratifier},
{@link setCode},
{@link setPopulation},
{@link setStratifier},
 */

@Description("The Measure resource provides the definition of a quality measure.")

public interface MeasureGroup extends GenericEntity, fhir.BackboneElement {

	EntityType<MeasureGroup> T = EntityTypes.T(MeasureGroup.class);

	/* Constants for each property name. */
	java.lang.String code = "code";
	java.lang.String population = "population";
	java.lang.String stratifier = "stratifier";

	@Description("Indicates a meaning for the group. This can be as simple as a unique identifier, or it can establish meaning in a broader context by drawing from a terminology, allowing groups to be correlated across measures.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
	@Description("A population criteria for the measure.")
	
	java.util.List<fhir.MeasurePopulation> getPopulation();
	void setPopulation(java.util.List<fhir.MeasurePopulation> population);

	@Description("The stratifier criteria for the measure report, specified as either the name of a valid CQL expression defined within a referenced library or a valid FHIR Resource Path.")
	
	java.util.List<fhir.MeasureStratifier> getStratifier();
	void setStratifier(java.util.List<fhir.MeasureStratifier> stratifier);

}

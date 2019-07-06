/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MeasureSupplementalData of the Data Model fhir.
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
{@link usage}, 
{@link criteria}, 

* It provides of then following operations (getters and setters)
{@link getCode},
{@link getUsage},
{@link getCriteria},
{@link setCode},
{@link setUsage},
{@link setCriteria},
 */

@Description("The Measure resource provides the definition of a quality measure.")

public interface MeasureSupplementalData extends GenericEntity, fhir.BackboneElement {

	EntityType<MeasureSupplementalData> T = EntityTypes.T(MeasureSupplementalData.class);

	/* Constants for each property name. */
	java.lang.String code = "code";
	java.lang.String usage = "usage";
	java.lang.String criteria = "criteria";

	@Description("Indicates a meaning for the supplemental data. This can be as simple as a unique identifier, or it can establish meaning in a broader context by drawing from a terminology, allowing supplemental data to be correlated across measures.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
	@Description("An indicator of the intended usage for the supplemental data element. Supplemental data indicates the data is additional information requested to augment the measure information. Risk adjustment factor indicates the data is additional information used to calculate risk adjustment factors when applying a risk model to the measure calculation.")
	
	java.util.List<fhir.CodeableConcept> getUsage();
	void setUsage(java.util.List<fhir.CodeableConcept> usage);

	@Description("The criteria for the supplemental data. This is typically the name of a valid expression defined within a referenced library, but it may also be a path to a specific data element. The criteria defines the data to be returned for this element.")
	@Mandatory
	fhir.Expression getCriteria();
	void setCriteria(fhir.Expression criteria);
}

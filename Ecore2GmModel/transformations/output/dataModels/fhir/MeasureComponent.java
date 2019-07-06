/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MeasureComponent of the Data Model fhir.
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
{@link criteria}, 

* It provides of then following operations (getters and setters)
{@link getCode},
{@link getCriteria},
{@link setCode},
{@link setCriteria},
 */

@Description("The Measure resource provides the definition of a quality measure.")

public interface MeasureComponent extends GenericEntity, fhir.BackboneElement {

	EntityType<MeasureComponent> T = EntityTypes.T(MeasureComponent.class);

	/* Constants for each property name. */
	java.lang.String code = "code";
	java.lang.String criteria = "criteria";

	@Description("Indicates a meaning for the stratifier component. This can be as simple as a unique identifier, or it can establish meaning in a broader context by drawing from a terminology, allowing stratifiers to be correlated across measures.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
	@Description("An expression that specifies the criteria for this component of the stratifier. This is typically the name of an expression defined within a referenced library, but it may also be a path to a stratifier element.")
	@Mandatory
	fhir.Expression getCriteria();
	void setCriteria(fhir.Expression criteria);
}

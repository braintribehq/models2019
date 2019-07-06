/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type DetectedIssueMitigation of the Data Model fhir.
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
{@link action}, 
{@link author}, 

* It provides of then following operations (getters and setters)
{@link getAction},
{@link getAuthor},
{@link setAction},
{@link setAuthor},
 */

@Description("Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, Ineffective treatment frequency, Procedure-condition conflict, etc.")

public interface DetectedIssueMitigation extends GenericEntity, fhir.BackboneElement {

	EntityType<DetectedIssueMitigation> T = EntityTypes.T(DetectedIssueMitigation.class);

	/* Constants for each property name. */
	java.lang.String action = "action";
	java.lang.String author = "author";

	@Description("Describes the action that was taken or the observation that was made that reduces/eliminates the risk associated with the identified issue.")
	@Mandatory
	fhir.CodeableConcept getAction();
	void setAction(fhir.CodeableConcept action);
	@Description("Identifies the practitioner who determined the mitigation and takes responsibility for the mitigation step occurring.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getAuthor();
	void setAuthor(com.braintribe.model.generic.GenericEntity author);
}

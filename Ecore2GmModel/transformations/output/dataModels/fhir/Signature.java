/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Signature of the Data Model fhir.
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
{@link type}, 
{@link who}, 
{@link onBehalfOf}, 

* It provides of then following operations (getters and setters)
{@link getType},
{@link getWho},
{@link getOnBehalfOf},
{@link setType},
{@link setWho},
{@link setOnBehalfOf},
 */

@Description("A signature along with supporting context. The signature may be a digital signature that is cryptographic in nature, or some other signature acceptable to the domain. This other signature may be as simple as a graphical image representing a hand-written signature, or a signature ceremony Different signature approaches have different utilities.If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions")

public interface Signature extends GenericEntity {

	EntityType<Signature> T = EntityTypes.T(Signature.class);

	/* Constants for each property name. */
	java.lang.String type = "type";
	java.lang.String who = "who";
	java.lang.String onBehalfOf = "onBehalfOf";

	@Description("An indication of the reason that the entity signed this document. This may be explicitly included as part of the signature information and can be used when determining accountability for various actions concerning the document.")
	
	java.util.List<fhir.Coding> getType();
	void setType(java.util.List<fhir.Coding> type);

	@Description("A reference to an application-usable description of the identity that signed  (e.g. the signature used their private key).")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getWho();
	void setWho(com.braintribe.model.generic.GenericEntity who);
	@Description("A reference to an application-usable description of the identity that is represented by the signature.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getOnBehalfOf();
	void setOnBehalfOf(com.braintribe.model.generic.GenericEntity onBehalfOf);
}

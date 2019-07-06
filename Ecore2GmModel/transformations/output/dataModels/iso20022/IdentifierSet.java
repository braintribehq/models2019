/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IdentifierSet of the Data Model iso20022.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package iso20022;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link identificationScheme}, 

* It provides of then following operations (getters and setters)
{@link getIdentificationScheme},
{@link setIdentificationScheme},
 */

@Description("Set of values whereby each value distinguishes uniquely one instance of an object within an identification scheme from all other instances of the objects within the same scheme.")

public interface IdentifierSet extends GenericEntity, iso20022.String {

	EntityType<IdentifierSet> T = EntityTypes.T(IdentifierSet.class);

	/* Constants for each property name. */
	java.lang.String identificationScheme = "identificationScheme";

	@Description("Uniquely identifies a set of identifiers through a Uniform Resource Identifier (URI).")
	@Mandatory
	java.lang.String getIdentificationScheme();
	void setIdentificationScheme(java.lang.String identificationScheme);
}

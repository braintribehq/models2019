/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Enumerationliteral of the Data Model uml.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package uml;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link enumeration}, 

* It provides of then following operations (getters and setters)
{@link getEnumeration},
{@link setEnumeration},
 */

@Description("An EnumerationLiteral is a user-defined data value for an Enumeration.<p>From package UML::SimpleClassifiers.</p>")

public interface Enumerationliteral extends GenericEntity, uml.Instancespecification {

	EntityType<Enumerationliteral> T = EntityTypes.T(Enumerationliteral.class);

	/* Constants for each property name. */
	java.lang.String enumeration = "enumeration";

	@Description("The Enumeration that this EnumerationLiteral is a member of.<p>From package UML::SimpleClassifiers.</p>")
	@Mandatory
	uml.Enumeration getEnumeration();
	void setEnumeration(uml.Enumeration enumeration);
}

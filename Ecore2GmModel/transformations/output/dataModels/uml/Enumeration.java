/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Enumeration of the Data Model uml.
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
{@link ownedLiteral}, 

* It provides of then following operations (getters and setters)
{@link getOwnedLiteral},
{@link setOwnedLiteral},
 */

@Description("An Enumeration is a DataType whose values are enumerated in the model as EnumerationLiterals.<p>From package UML::SimpleClassifiers.</p>")

public interface Enumeration extends GenericEntity, uml.Datatype {

	EntityType<Enumeration> T = EntityTypes.T(Enumeration.class);

	/* Constants for each property name. */
	java.lang.String ownedLiteral = "ownedLiteral";

	@Description("The ordered set of literals owned by this Enumeration.<p>From package UML::SimpleClassifiers.</p>")
	
	java.util.List<uml.Enumerationliteral> getOwnedLiteral();
	void setOwnedLiteral(java.util.List<uml.Enumerationliteral> ownedLiteral);

}

/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Datatype of the Data Model uml.
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
{@link ownedAttribute}, 
{@link ownedOperation}, 

* It provides of then following operations (getters and setters)
{@link getOwnedAttribute},
{@link getOwnedOperation},
{@link setOwnedAttribute},
{@link setOwnedOperation},
 */

@Description("A DataType is a type whose instances are identified only by their value.<p>From package UML::SimpleClassifiers.</p>")

public interface Datatype extends GenericEntity, uml.Classifier {

	EntityType<Datatype> T = EntityTypes.T(Datatype.class);

	/* Constants for each property name. */
	java.lang.String ownedAttribute = "ownedAttribute";
	java.lang.String ownedOperation = "ownedOperation";

	@Description("The attributes owned by the DataType.<p>From package UML::SimpleClassifiers.</p>")
	
	java.util.List<uml.Property> getOwnedAttribute();
	void setOwnedAttribute(java.util.List<uml.Property> ownedAttribute);

	@Description("The Operations owned by the DataType.<p>From package UML::SimpleClassifiers.</p>")
	
	java.util.List<uml.Operation> getOwnedOperation();
	void setOwnedOperation(java.util.List<uml.Operation> ownedOperation);

}

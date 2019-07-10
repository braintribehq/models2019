/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Extension of the Data Model uml.
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
{@link isRequired}, 
{@link metaclass}, 

* It provides of then following operations (getters and setters)
{@link getIsRequired},
{@link getMetaclass},
{@link setIsRequired},
{@link setMetaclass},
 */

@Description("An extension is used to indicate that the properties of a metaclass are extended through a stereotype, and gives the ability to flexibly add (and later remove) stereotypes to classes.<p>From package UML::Packages.</p>")

public interface Extension extends GenericEntity, uml.Association {

	EntityType<Extension> T = EntityTypes.T(Extension.class);

	/* Constants for each property name. */
	java.lang.String isRequired = "isRequired";
	java.lang.String metaclass = "metaclass";

	@Description("Indicates whether an instance of the extending stereotype must be created when an instance of the extended class is created. The attribute value is derived from the value of the lower property of the ExtensionEnd referenced by Extension::ownedEnd; a lower value of 1 means that isRequired is true, but otherwise it is false. Since the default value of ExtensionEnd::lower is 0, the default value of isRequired is false.<p>From package UML::Packages.</p>")
	@Mandatory
	types.Boolean getIsRequired();
	void setIsRequired(types.Boolean isRequired);
	@Description("References the Class that is extended through an Extension. The property is derived from the type of the memberEnd that is not the ownedEnd.<p>From package UML::Packages.</p>")
	@Mandatory
	uml.Class getMetaclass();
	void setMetaclass(uml.Class metaclass);
}

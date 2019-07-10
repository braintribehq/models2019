/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Element of the Data Model uml.
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
{@link ownedComment}, 
{@link ownedElement}, 
{@link owner}, 

* It provides of then following operations (getters and setters)
{@link getOwnedComment},
{@link getOwnedElement},
{@link getOwner},
{@link setOwnedComment},
{@link setOwnedElement},
{@link setOwner},
 */

@Description("An Element is a constituent of a model. As such, it has the capability of owning other Elements.<p>From package UML::CommonStructure.</p>")
 
@Abstract 

public interface Element extends GenericEntity {

	EntityType<Element> T = EntityTypes.T(Element.class);

	/* Constants for each property name. */
	java.lang.String ownedComment = "ownedComment";
	java.lang.String ownedElement = "ownedElement";
	java.lang.String owner = "owner";

	@Description("The Comments owned by this Element.<p>From package UML::CommonStructure.</p>")
	
	java.util.List<uml.Comment> getOwnedComment();
	void setOwnedComment(java.util.List<uml.Comment> ownedComment);

	@Description("The Elements owned by this Element.<p>From package UML::CommonStructure.</p>")
	
	java.util.List<uml.Element> getOwnedElement();
	void setOwnedElement(java.util.List<uml.Element> ownedElement);

	@Description("The Element that owns this Element.<p>From package UML::CommonStructure.</p>")
	@Mandatory
	uml.Element getOwner();
	void setOwner(uml.Element owner);
}

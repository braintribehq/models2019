/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Namedelement of the Data Model uml.
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
{@link clientDependency}, 
{@link name}, 
{@link nameExpression}, 
{@link namespace}, 
{@link qualifiedName}, 
{@link visibility}, 

* It provides of then following operations (getters and setters)
{@link getClientDependency},
{@link getName},
{@link getNameExpression},
{@link getNamespace},
{@link getQualifiedName},
{@link getVisibility},
{@link setClientDependency},
{@link setName},
{@link setNameExpression},
{@link setNamespace},
{@link setQualifiedName},
{@link setVisibility},
 */

@Description("A NamedElement is an Element in a model that may have a name. The name may be given directly and/or via the use of a StringExpression.<p>From package UML::CommonStructure.</p>")
 
@Abstract 

public interface Namedelement extends GenericEntity, uml.Element {

	EntityType<Namedelement> T = EntityTypes.T(Namedelement.class);

	/* Constants for each property name. */
	java.lang.String clientDependency = "clientDependency";
	java.lang.String name = "name";
	java.lang.String nameExpression = "nameExpression";
	java.lang.String namespace = "namespace";
	java.lang.String qualifiedName = "qualifiedName";
	java.lang.String visibility = "visibility";

	@Description("Indicates the Dependencies that reference this NamedElement as a client.<p>From package UML::CommonStructure.</p>")
	
	java.util.List<uml.Dependency> getClientDependency();
	void setClientDependency(java.util.List<uml.Dependency> clientDependency);

	@Description("The name of the NamedElement.<p>From package UML::CommonStructure.</p>")
	@Mandatory
	types.String getName();
	void setName(types.String name);
	@Description("The StringExpression used to define the name of this NamedElement.<p>From package UML::CommonStructure.</p>")
	@Mandatory
	uml.Stringexpression getNameExpression();
	void setNameExpression(uml.Stringexpression nameExpression);
	@Description("Specifies the Namespace that owns the NamedElement.<p>From package UML::CommonStructure.</p>")
	@Mandatory
	uml.Namespace getNamespace();
	void setNamespace(uml.Namespace namespace);
	@Description("A name that allows the NamedElement to be identified within a hierarchy of nested Namespaces. It is constructed from the names of the containing Namespaces starting at the root of the hierarchy and ending with the name of the NamedElement itself.<p>From package UML::CommonStructure.</p>")
	@Mandatory
	types.String getQualifiedName();
	void setQualifiedName(types.String qualifiedName);
	@Description("Determines whether and how the NamedElement is visible outside its owning Namespace.<p>From package UML::CommonStructure.</p>")
	@Mandatory
	uml.VisibilityKind getVisibility();
	void setVisibility(uml.VisibilityKind visibility);
}

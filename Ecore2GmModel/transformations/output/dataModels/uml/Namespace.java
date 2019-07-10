/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Namespace of the Data Model uml.
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
{@link ownedRule}, 
{@link elementImport}, 
{@link packageImport}, 
{@link ownedMember}, 
{@link importedMember}, 
{@link member}, 

* It provides of then following operations (getters and setters)
{@link getOwnedRule},
{@link getElementImport},
{@link getPackageImport},
{@link getOwnedMember},
{@link getImportedMember},
{@link getMember},
{@link setOwnedRule},
{@link setElementImport},
{@link setPackageImport},
{@link setOwnedMember},
{@link setImportedMember},
{@link setMember},
 */

@Description("A Namespace is an Element in a model that owns and/or imports a set of NamedElements that can be identified by name.<p>From package UML::CommonStructure.</p>")
 
@Abstract 

public interface Namespace extends GenericEntity, uml.Namedelement {

	EntityType<Namespace> T = EntityTypes.T(Namespace.class);

	/* Constants for each property name. */
	java.lang.String ownedRule = "ownedRule";
	java.lang.String elementImport = "elementImport";
	java.lang.String packageImport = "packageImport";
	java.lang.String ownedMember = "ownedMember";
	java.lang.String importedMember = "importedMember";
	java.lang.String member = "member";

	@Description("Specifies a set of Constraints owned by this Namespace.<p>From package UML::CommonStructure.</p>")
	
	java.util.List<uml.Constraint> getOwnedRule();
	void setOwnedRule(java.util.List<uml.Constraint> ownedRule);

	@Description("References the ElementImports owned by the Namespace.<p>From package UML::CommonStructure.</p>")
	
	java.util.List<uml.Elementimport> getElementImport();
	void setElementImport(java.util.List<uml.Elementimport> elementImport);

	@Description("References the PackageImports owned by the Namespace.<p>From package UML::CommonStructure.</p>")
	
	java.util.List<uml.Packageimport> getPackageImport();
	void setPackageImport(java.util.List<uml.Packageimport> packageImport);

	@Description("A collection of NamedElements owned by the Namespace.<p>From package UML::CommonStructure.</p>")
	
	java.util.List<uml.Namedelement> getOwnedMember();
	void setOwnedMember(java.util.List<uml.Namedelement> ownedMember);

	@Description("References the PackageableElements that are members of this Namespace as a result of either PackageImports or ElementImports.<p>From package UML::CommonStructure.</p>")
	
	java.util.List<uml.Packageableelement> getImportedMember();
	void setImportedMember(java.util.List<uml.Packageableelement> importedMember);

	@Description("A collection of NamedElements identifiable within the Namespace, either by being owned or by being introduced by importing or inheritance.<p>From package UML::CommonStructure.</p>")
	
	java.util.List<uml.Namedelement> getMember();
	void setMember(java.util.List<uml.Namedelement> member);

}

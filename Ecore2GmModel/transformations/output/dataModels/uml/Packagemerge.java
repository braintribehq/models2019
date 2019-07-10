/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Packagemerge of the Data Model uml.
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
{@link mergedPackage}, 
{@link receivingPackage}, 

* It provides of then following operations (getters and setters)
{@link getMergedPackage},
{@link getReceivingPackage},
{@link setMergedPackage},
{@link setReceivingPackage},
 */

@Description("A package merge defines how the contents of one package are extended by the contents of another package.<p>From package UML::Packages.</p>")

public interface Packagemerge extends GenericEntity, uml.Directedrelationship {

	EntityType<Packagemerge> T = EntityTypes.T(Packagemerge.class);

	/* Constants for each property name. */
	java.lang.String mergedPackage = "mergedPackage";
	java.lang.String receivingPackage = "receivingPackage";

	@Description("References the Package that is to be merged with the receiving package of the PackageMerge.<p>From package UML::Packages.</p>")
	@Mandatory
	uml.Package getMergedPackage();
	void setMergedPackage(uml.Package mergedPackage);
	@Description("References the Package that is being extended with the contents of the merged package of the PackageMerge.<p>From package UML::Packages.</p>")
	@Mandatory
	uml.Package getReceivingPackage();
	void setReceivingPackage(uml.Package receivingPackage);
}

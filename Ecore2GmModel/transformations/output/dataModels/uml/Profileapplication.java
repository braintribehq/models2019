/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Profileapplication of the Data Model uml.
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
{@link appliedProfile}, 
{@link isStrict}, 
{@link applyingPackage}, 

* It provides of then following operations (getters and setters)
{@link getAppliedProfile},
{@link getIsStrict},
{@link getApplyingPackage},
{@link setAppliedProfile},
{@link setIsStrict},
{@link setApplyingPackage},
 */

@Description("A profile application is used to show which profiles have been applied to a package.<p>From package UML::Packages.</p>")

public interface Profileapplication extends GenericEntity, uml.Directedrelationship {

	EntityType<Profileapplication> T = EntityTypes.T(Profileapplication.class);

	/* Constants for each property name. */
	java.lang.String appliedProfile = "appliedProfile";
	java.lang.String isStrict = "isStrict";
	java.lang.String applyingPackage = "applyingPackage";

	@Description("References the Profiles that are applied to a Package through this ProfileApplication.<p>From package UML::Packages.</p>")
	@Mandatory
	uml.Profile getAppliedProfile();
	void setAppliedProfile(uml.Profile appliedProfile);
	@Description("Specifies that the Profile filtering rules for the metaclasses of the referenced metamodel shall be strictly applied.<p>From package UML::Packages.</p>")
	@Mandatory
	types.Boolean getIsStrict();
	void setIsStrict(types.Boolean isStrict);
	@Description("The package that owns the profile application.<p>From package UML::Packages.</p>")
	@Mandatory
	uml.Package getApplyingPackage();
	void setApplyingPackage(uml.Package applyingPackage);
}

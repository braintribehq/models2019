/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcTrimmedCurve of the Data Model iai.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package ifc4;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link BasisCurve}, 
{@link Trim1}, 
{@link Trim2}, 
{@link SenseAgreement}, 
{@link MasterRepresentation}, 

* It provides of then following operations (getters and setters)
{@link getBasisCurve},
{@link getTrim1},
{@link getTrim2},
{@link getSenseAgreement},
{@link getMasterRepresentation},
{@link setBasisCurve},
{@link setTrim1},
{@link setTrim2},
{@link setSenseAgreement},
{@link setMasterRepresentation},
 */

@Description("")

public interface IfcTrimmedCurve extends GenericEntity, ifc4.IfcBoundedCurve {

	EntityType<IfcTrimmedCurve> T = EntityTypes.T(IfcTrimmedCurve.class);

	/* Constants for each property name. */
	java.lang.String BasisCurve = "BasisCurve";
	java.lang.String Trim1 = "Trim1";
	java.lang.String Trim2 = "Trim2";
	java.lang.String SenseAgreement = "SenseAgreement";
	java.lang.String MasterRepresentation = "MasterRepresentation";

	@Description("")
	@Mandatory
	ifc4.IfcCurve getBasisCurve();
	void setBasisCurve(ifc4.IfcCurve BasisCurve);
	@Description("")
	
	java.util.List<ifc4.IfcTrimmingSelect> getTrim1();
	void setTrim1(java.util.List<ifc4.IfcTrimmingSelect> Trim1);

	@Description("")
	
	java.util.List<ifc4.IfcTrimmingSelect> getTrim2();
	void setTrim2(java.util.List<ifc4.IfcTrimmingSelect> Trim2);

	@Description("")
	@Mandatory
	ifc4.Tristate getSenseAgreement();
	void setSenseAgreement(ifc4.Tristate SenseAgreement);
	@Description("")
	@Mandatory
	ifc4.IfcTrimmingPreference getMasterRepresentation();
	void setMasterRepresentation(ifc4.IfcTrimmingPreference MasterRepresentation);
}

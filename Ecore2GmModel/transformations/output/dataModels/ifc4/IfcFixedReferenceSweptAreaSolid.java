/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcFixedReferenceSweptAreaSolid of the Data Model iai.
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
{@link Directrix}, 
{@link StartParam}, 
{@link StartParamAsString}, 
{@link EndParam}, 
{@link EndParamAsString}, 
{@link FixedReference}, 

* It provides of then following operations (getters and setters)
{@link getDirectrix},
{@link getStartParam},
{@link getStartParamAsString},
{@link getEndParam},
{@link getEndParamAsString},
{@link getFixedReference},
{@link setDirectrix},
{@link setStartParam},
{@link setStartParamAsString},
{@link setEndParam},
{@link setEndParamAsString},
{@link setFixedReference},
 */

@Description("")

public interface IfcFixedReferenceSweptAreaSolid extends GenericEntity, ifc4.IfcSweptAreaSolid {

	EntityType<IfcFixedReferenceSweptAreaSolid> T = EntityTypes.T(IfcFixedReferenceSweptAreaSolid.class);

	/* Constants for each property name. */
	java.lang.String Directrix = "Directrix";
	java.lang.String StartParam = "StartParam";
	java.lang.String StartParamAsString = "StartParamAsString";
	java.lang.String EndParam = "EndParam";
	java.lang.String EndParamAsString = "EndParamAsString";
	java.lang.String FixedReference = "FixedReference";

	@Description("")
	@Mandatory
	ifc4.IfcCurve getDirectrix();
	void setDirectrix(ifc4.IfcCurve Directrix);
	@Description("")
	@Mandatory
	java.lang.Double getStartParam();
	void setStartParam(java.lang.Double StartParam);
	@Description("")
	@Mandatory
	java.lang.String getStartParamAsString();
	void setStartParamAsString(java.lang.String StartParamAsString);
	@Description("")
	@Mandatory
	java.lang.Double getEndParam();
	void setEndParam(java.lang.Double EndParam);
	@Description("")
	@Mandatory
	java.lang.String getEndParamAsString();
	void setEndParamAsString(java.lang.String EndParamAsString);
	@Description("")
	@Mandatory
	ifc4.IfcDirection getFixedReference();
	void setFixedReference(ifc4.IfcDirection FixedReference);
}

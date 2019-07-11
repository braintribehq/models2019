/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcTimeSeries of the Data Model iai.
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
{@link Name}, 
{@link Description}, 
{@link StartTime}, 
{@link EndTime}, 
{@link TimeSeriesDataType}, 
{@link DataOrigin}, 
{@link UserDefinedDataOrigin}, 
{@link Unit}, 
{@link HasExternalReference}, 

* It provides of then following operations (getters and setters)
{@link getName},
{@link getDescription},
{@link getStartTime},
{@link getEndTime},
{@link getTimeSeriesDataType},
{@link getDataOrigin},
{@link getUserDefinedDataOrigin},
{@link getUnit},
{@link getHasExternalReference},
{@link setName},
{@link setDescription},
{@link setStartTime},
{@link setEndTime},
{@link setTimeSeriesDataType},
{@link setDataOrigin},
{@link setUserDefinedDataOrigin},
{@link setUnit},
{@link setHasExternalReference},
 */

@Description("")

public interface IfcTimeSeries extends GenericEntity, ifc4.IfcMetricValueSelect, ifc4.IfcObjectReferenceSelect, ifc4.IfcResourceObjectSelect {

	EntityType<IfcTimeSeries> T = EntityTypes.T(IfcTimeSeries.class);

	/* Constants for each property name. */
	java.lang.String Name = "Name";
	java.lang.String Description = "Description";
	java.lang.String StartTime = "StartTime";
	java.lang.String EndTime = "EndTime";
	java.lang.String TimeSeriesDataType = "TimeSeriesDataType";
	java.lang.String DataOrigin = "DataOrigin";
	java.lang.String UserDefinedDataOrigin = "UserDefinedDataOrigin";
	java.lang.String Unit = "Unit";
	java.lang.String HasExternalReference = "HasExternalReference";

	@Description("")
	@Mandatory
	java.lang.String getName();
	void setName(java.lang.String Name);
	@Description("")
	@Mandatory
	java.lang.String getDescription();
	void setDescription(java.lang.String Description);
	@Description("")
	@Mandatory
	java.lang.String getStartTime();
	void setStartTime(java.lang.String StartTime);
	@Description("")
	@Mandatory
	java.lang.String getEndTime();
	void setEndTime(java.lang.String EndTime);
	@Description("")
	@Mandatory
	ifc4.IfcTimeSeriesDataTypeEnum getTimeSeriesDataType();
	void setTimeSeriesDataType(ifc4.IfcTimeSeriesDataTypeEnum TimeSeriesDataType);
	@Description("")
	@Mandatory
	ifc4.IfcDataOriginEnum getDataOrigin();
	void setDataOrigin(ifc4.IfcDataOriginEnum DataOrigin);
	@Description("")
	@Mandatory
	java.lang.String getUserDefinedDataOrigin();
	void setUserDefinedDataOrigin(java.lang.String UserDefinedDataOrigin);
	@Description("")
	@Mandatory
	ifc4.IfcUnit getUnit();
	void setUnit(ifc4.IfcUnit Unit);
	@Description("")
	
	java.util.List<ifc4.IfcExternalReferenceRelationship> getHasExternalReference();
	void setHasExternalReference(java.util.List<ifc4.IfcExternalReferenceRelationship> HasExternalReference);

}

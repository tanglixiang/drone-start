package com.example;

import com.mapbox.geojson.Feature;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.geojson.LineString;
import com.mapbox.geojson.Point;
import com.mapbox.turf.TurfMisc;

import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public void calculateWorker (LineString riverCenterLine, Point pointPollution, List<Point> riverGridPoints) {
        // 先做排污口到中心线的垂线，求出垂点1
        Feature verticalPoint1 = TurfMisc.nearestPointOnLine(pointPollution, riverCenterLine.coordinates());

        riverGridPoints.forEach((point -> {
            // verticalPoint2 每个网格点都要做中心线的垂线，求出垂点2和垂线1。
            Feature verticalPoint2 = TurfMisc.nearestPointOnLine(point, riverCenterLine.coordinates());

            // 由垂点1 垂点2 和 中心线 求出线长X
//            TurfMisc.lineSlice(verticalPoint1, verticalPoint2, riverCenterLine);

        }));
    }
}
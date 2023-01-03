import {Component, OnInit} from '@angular/core';
import Chart from 'chart.js/auto';
@Component({
  selector: 'app-grafico-donut',
  templateUrl: './grafico-donut.component.html',
  styleUrls: ['./grafico-donut.component.css']
})
export class GraficoDonutComponent implements OnInit {
  public Donutchart: any;
  createChart(){
    this.Donutchart = new Chart("MyDonutChart", {
      type: 'doughnut',

      data: {// values on X-Axis
        labels: ["Glosas Totais","Glosas Integrais", "Inadimplências"],
        datasets: [
          {
            data: ['467','576', '72']
          }
        ]
      },

    });
  }
  ngOnInit(): void {
    this.createChart();
  }
}

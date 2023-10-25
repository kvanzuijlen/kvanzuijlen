### Koen van Zuijlen

Senior Site Reliability Engineer @ de Bijenkorf, The Netherlands

![kvanzuijlen's GitHub stats](https://github-readme-stats.vercel.app/api?username=kvanzuijlen&show=reviews,discussions_started,discussions_answered,prs_merged,prs_merged_percentage&show_icons=true&theme=dark&cache_seconds=86400)

### 🛠️ Recent contributions
{{ range recentContributions 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}

### 🌱 Recent projects
{{ range recentRepos 5 }}
- [{{ .Name }}]({{ .URL }}) - {{ .Description }}
{{- end }}

### 🚧 My recent Pull Requests
{{ range recentPullRequests 5 }}
- [{{ .Title }}]({{ .URL }}) on [{{ .Repo.Name }}]({{ .Repo.URL }})
{{- end }}

### 🚀 Latest releases I've contributed to
{{ range recentReleases 5 }}
- [{{ .Name }}]({{ .URL }}) [`{{ .LastRelease.TagName }}`]({{ .LastRelease.URL }}) - {{.Description}}
{{- end }}

### ⭐ Recent Stars
{{ range recentStars 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}

### 👀 Recent followers
{{ range followers 5 }}
- [**@{{ .Login }}**]({{ .URL }})
{{- end }}
